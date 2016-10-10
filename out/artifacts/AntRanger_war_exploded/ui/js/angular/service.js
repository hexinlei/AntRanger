/**
 * Created by hexinlei on 16/8/24.
 */
angular.module('service',[])
    .factory('init',function (http) {
        var init = {};
        var url;
        var params;
        // 获取用户信息
        init.inituserInfo = function (uid) {
            url = 'http://localhost:8080/ajax/user/getUserInfo';
            return http.Get(url,null);
        };

        init.initTree = function (uid) {
            url = '';
            params = {'userID':uid};
            return http.Get(url,params);
        };



        return init;


    })
    .factory('http',function ($http,$q) {
        //http Get 请求
        var http = {};
        http.Get = function (url,params) {
            var test = $q.defer();
            $http({
                url:url,
                method:'GET',
                params:params
            }).success(function (data) {
                test.resolve(data);
            }).error(function () {
                test.reject("error");
            })
            return test.promise;
        };

        //http Post 请求
        http.Post = function (url,params) {
            var test = $q.defer();
            $http({
                url:url,
                method:'POST',
                data:params
            }).success(function (data) {
                test.resolve(data);
            }).error(function () {
                test.reject("error");
            })
            return test.promise;
        };

        return http;
    })
    .filter('IdFilter',function () {
        
    })

/**
 * Created by hexinlei on 16/8/24.
 */
angular.module('controller',[])
    .controller('titleController',function ($scope) {
        $scope.title = setTitle();

    })
    .controller('userInfoController',function ($scope,init) {
        init.inituserInfo('luohao').then(function (data) {
            $scope.info = data;
        });
        
        init.initTree()

        $scope.myfilter = function (data) {
            return data.ATWRT == '18000';
        };
    });



function setTitle() {
    return "AntRanger";
}


package com.ant.ranger.controller.ajax;

import com.ant.ranger.mapping.user.UserFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @packgeName: com.ant.ranger.controller.ajax
 * @ClassName: AjaxUserController
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/8/30-下午5:10
 * @version: 1.0
 * @since: JDK 1.8
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/ajax/user")
public class AjaxUserController {

    @Resource
    private UserFacade userFacade;

    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public Object getUserInfo() throws Exception {
        return userFacade.findUserByUid("admin");
    }


}

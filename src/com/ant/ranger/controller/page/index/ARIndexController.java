package com.ant.ranger.controller.page.index;

import com.ant.ranger.controller.ARBaseController;
import com.ant.ranger.controller.constants.ARPageConstans;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @packgeName: com.ant.ranger.controller
 * @ClassName: ARIndexController
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/22-上午10:51
 * @version: 1.0
 * @since: JDK 1.8
 */

@Controller
@RequestMapping(value = "index")
public class ARIndexController extends ARBaseController {

    @RequestMapping(value = "index")
    public String index(){
        return ARPageConstans.Page.index;
    }

}

package com.ant.ranger.service.generate;

import com.ant.ranger.dao.message.MessageDao;
import com.ant.ranger.dao.user.UserDao;
import com.ant.ranger.entity.Message;
import com.ant.ranger.entity.User;
import com.ant.ranger.entity.Visitor;
import com.ant.ranger.service.message.MessageService;
import com.ant.ranger.service.user.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @packgeName: com.ant.ranger.service.generate
 * @ClassName: ARBaseGenerateNoStrategiesTest
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/7/22-下午5:45
 * @version: 1.0
 * @since: JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
//@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class ARBaseGenerateNoStrategiesTest {

    @Resource(name = "baseGenerateNoStrategies")
    ARBaseGenerateNoStrategies baseGenerateNoStrategies;

    @Autowired
    private UserDao userDao;

    @Resource
    private UserService userService;

    @Resource
    private SessionFactory sessionFactory;

    @Resource
    private MessageService messageService;

    @Resource
    private MessageDao messageDao;

    @Test
    public void generateNo() throws Exception {
        for(int i=0;i<10;i++){
            System.out.println(baseGenerateNoStrategies.generateNo());
        }
    }

    @Test
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void testSave() throws Exception{
        User user = new User();
        user.setName("何鑫磊");
        user.setUid("admin");
        user.setPassword("hexinlei");
        user.setEmail("1015640887@qq.com");
        user.setImg("../ui/img/profile.jpg");
        user.setSelfIntroduction("Java Engineer");
        user.setNickname("AntRanger");
        System.out.println(user.getName());
        userDao.insert(user);
//        Visitor visitor = new Visitor();
//        visitor.setName("何鑫磊");
//        visitor.setUid("admin");
//        Set<Message> messageSet = new HashSet<>();
//
//        Message message = new Message("测试001",visitor);
//        messageSet.add(message);
//        visitor.setMessages(messageSet);
//        userService.saveUser(visitor);
//        messageService.addMessage(message);


    }

    @Test
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void getSession(){
        System.out.println("获取SessioFactory。。。");
        sessionFactory.getCurrentSession();
    }

    @Test
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void execute(){


        User user = userService.findUserByUid("admin");

        if (null!=user){
            if (user instanceof Visitor){
                System.out.println(((Visitor) user).getMessages().size());

                ((Visitor) user).getMessages().stream().forEach(e->{
                    System.out.println(e.getCommon());
                });
            }
            System.out.println(user.getUid());
        }else {
            System.out.println("test");
        }

        List<Message> messages = messageDao.queryAll();
        if (CollectionUtils.isNotEmpty(messages)){
            messages.stream().forEach(m->{
                System.out.println(m.getVisitor().getUid()+"-"+m.getVisitor().getName());
            });


        }


    }
}

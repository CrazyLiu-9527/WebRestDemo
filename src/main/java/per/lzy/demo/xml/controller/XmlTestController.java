package per.lzy.demo.xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.lzy.demo.xml.model.TestEntity;
import per.lzy.demo.xml.model.TestListEntity;
import per.lzy.demo.xml.service.XmlTestService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhiyuan
 * @date 2021/1/15 18:15
 */
@RestController
public class XmlTestController {

    @Autowired
    private XmlTestService testService;

    @PostMapping(value = "/entity")
    public List<TestEntity> getEntity() {
        System.out.println("invoke interface entity");
        return testService.getEntity();

    }

    @PostMapping(value = "/testlistentity")
    public TestListEntity testlistentity() {
        System.out.println("invoke interface testlistentity");
        TestListEntity testListEntity = new TestListEntity();
        List<TestEntity> list = new ArrayList<>();
        list.add(new TestEntity("liuzhiyuan", "zhiyuan", 18));
        list.add(new TestEntity("lijie", "jie", 18));
        testListEntity.setList(list);

        return testListEntity;
    }

}

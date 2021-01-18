package per.lzy.demo.xml.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * @author liuzhiyuan
 * @date 2021/1/18 18:16
 */
@JacksonXmlRootElement(localName = "collection")
public class TestListEntity {
    // 去除外层标签名称
    // @JacksonXmlElementWrapper(useWrapping = false)
    // 指定标签名称
    @JacksonXmlElementWrapper(localName = "entities")
    @JacksonXmlProperty(localName = "entity")
    private List<TestEntity> list;

    public List<TestEntity> getList() {
        return list;
    }

    public void setList(List<TestEntity> list) {
        this.list = list;
    }
}

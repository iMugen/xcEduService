package com.xuecheng.framework.domain.system;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * @author Daniel Liu 2020/4/28 10:23
 */
@Data
@ToString
@Document( collection = "sys_dictionary" )
public class SysDictionary {
    @Id
    private String id;
    @Field( "d_name" )
    private String dName;
    @Field( "d_type" )
    private String dType;
    @Field( "d_value" )
    private List<SysDictionaryValue> dValue;

}
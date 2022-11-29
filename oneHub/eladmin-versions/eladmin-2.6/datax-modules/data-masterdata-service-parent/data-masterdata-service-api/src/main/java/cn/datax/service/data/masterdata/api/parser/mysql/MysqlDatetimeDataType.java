package cn.datax.service.data.masterdata.api.parser.mysql;

import cn.datax.service.data.masterdata.api.parser.DataType;

public class MysqlDatetimeDataType implements DataType {

    @Override
    public String fillTypeString(String columnLength, String columnScale) {
        return "datetime";
    }
}

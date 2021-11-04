package com.zephyraft.dp._1creation._2factory._1simplefactory._1nocache;

import com.zephyraft.dp._1creation._2factory._help.*;

/**
 * 第一种实现方式，每次创建新的对象
 */
public class RuleConfigParserFactory {
    public static RuleConfigParser createParser(String configFormat) {
        RuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}

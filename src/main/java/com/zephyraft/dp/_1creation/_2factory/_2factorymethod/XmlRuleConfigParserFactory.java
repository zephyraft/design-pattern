package com.zephyraft.dp._1creation._2factory._2factorymethod;

import com.zephyraft.dp._1creation._2factory._help.RuleConfigParser;
import com.zephyraft.dp._1creation._2factory._help.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}

package com.zephyraft.dp._1creation._2factory._2factorymethod;

import com.zephyraft.dp._1creation._2factory._help.PropertiesRuleConfigParser;
import com.zephyraft.dp._1creation._2factory._help.RuleConfigParser;

public class PropertiesRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}

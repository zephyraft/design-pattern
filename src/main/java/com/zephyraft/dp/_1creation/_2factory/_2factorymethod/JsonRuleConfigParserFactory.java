package com.zephyraft.dp._1creation._2factory._2factorymethod;

import com.zephyraft.dp._1creation._2factory._help.JsonRuleConfigParser;
import com.zephyraft.dp._1creation._2factory._help.RuleConfigParser;

public class JsonRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}

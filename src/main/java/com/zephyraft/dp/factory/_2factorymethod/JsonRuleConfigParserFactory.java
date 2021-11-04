package com.zephyraft.dp.factory._2factorymethod;

import com.zephyraft.dp.factory._help.JsonRuleConfigParser;
import com.zephyraft.dp.factory._help.RuleConfigParser;

public class JsonRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}

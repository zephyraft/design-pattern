package com.zephyraft.dp.factory._2factorymethod;

import com.zephyraft.dp.factory._help.PropertiesRuleConfigParser;
import com.zephyraft.dp.factory._help.RuleConfigParser;

public class PropertiesRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}

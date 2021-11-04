package com.zephyraft.dp.factory._2factorymethod;

import com.zephyraft.dp.factory._help.RuleConfigParser;
import com.zephyraft.dp.factory._help.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}

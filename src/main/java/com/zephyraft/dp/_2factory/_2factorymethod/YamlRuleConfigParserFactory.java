package com.zephyraft.dp._2factory._2factorymethod;

import com.zephyraft.dp._2factory._help.RuleConfigParser;
import com.zephyraft.dp._2factory._help.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}

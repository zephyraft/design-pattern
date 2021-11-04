package com.zephyraft.dp._2factory._3abstractfactory;

import com.zephyraft.dp._2factory._help.*;

public class YamlConfigParserFactory implements ConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new YamlSystemConfigParser();
    }
}

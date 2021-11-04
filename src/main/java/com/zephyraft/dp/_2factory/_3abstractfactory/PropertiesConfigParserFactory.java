package com.zephyraft.dp._2factory._3abstractfactory;

import com.zephyraft.dp._2factory._help.*;

public class PropertiesConfigParserFactory implements ConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new PropertiesSystemConfigParser();
    }
}

package com.zephyraft.dp.factory._3abstractfactory;

import com.zephyraft.dp.factory._help.*;

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

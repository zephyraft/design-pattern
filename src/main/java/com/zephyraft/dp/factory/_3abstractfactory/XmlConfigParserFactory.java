package com.zephyraft.dp.factory._3abstractfactory;

import com.zephyraft.dp.factory._help.*;

public class XmlConfigParserFactory implements ConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}

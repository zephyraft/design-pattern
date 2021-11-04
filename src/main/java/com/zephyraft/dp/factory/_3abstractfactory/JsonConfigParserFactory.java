package com.zephyraft.dp.factory._3abstractfactory;

import com.zephyraft.dp.factory._help.JsonRuleConfigParser;
import com.zephyraft.dp.factory._help.JsonSystemConfigParser;
import com.zephyraft.dp.factory._help.RuleConfigParser;
import com.zephyraft.dp.factory._help.SystemConfigParser;

public class JsonConfigParserFactory implements ConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}

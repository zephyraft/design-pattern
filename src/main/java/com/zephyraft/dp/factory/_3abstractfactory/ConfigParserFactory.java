package com.zephyraft.dp.factory._3abstractfactory;

import com.zephyraft.dp.factory._help.RuleConfigParser;
import com.zephyraft.dp.factory._help.SystemConfigParser;

public interface ConfigParserFactory {
    RuleConfigParser createParser();
    SystemConfigParser createSystemParser();
}

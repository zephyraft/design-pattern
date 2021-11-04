package com.zephyraft.dp._1creation._2factory._3abstractfactory;

import com.zephyraft.dp._1creation._2factory._help.RuleConfigParser;
import com.zephyraft.dp._1creation._2factory._help.SystemConfigParser;

public interface ConfigParserFactory {
    RuleConfigParser createParser();
    SystemConfigParser createSystemParser();
}

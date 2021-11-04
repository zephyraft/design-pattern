package com.zephyraft.dp._2factory._1simplefactory._2cached;

import com.zephyraft.dp._2factory._help.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 第二种实现，实现创建好，缓存起来
 */
public class RuleConfigParserFactory {
    private static final Map<String, RuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static RuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null; //返回null还是IllegalArgumentException全凭你自己说了算
        }
        return cachedParsers.get(configFormat.toLowerCase());
    }
}

package com.zephyraft.dp._1creation._2factory._framework;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ClassPathXmlApplicationContext implements ApplicationContext {
    private final BeansFactory beansFactory;
    private final BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation) {
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinitions(configLocation);
    }

    private void loadBeanDefinitions(String configLocation) {
        try (InputStream in = this.getClass().getResourceAsStream("/" + configLocation)) {
            if (in == null) {
                throw new RuntimeException("Can not find config file: " + configLocation);
            }
            List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
            beansFactory.addBeanDefinitions(beanDefinitions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanId) {
        return beansFactory.getBean(beanId);
    }
}

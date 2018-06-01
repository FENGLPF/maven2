package com.ssm.test;

import org.mybatis.generator.api.ShellRunner;

public class mybatis_generatorTest {
	public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}

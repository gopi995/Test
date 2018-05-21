package com.MT.test;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;
import javax.script.*;

public class MainTest {

    public static void main(String[] args) throws Exception {
    	
    	

        Configuration cfg = new Configuration();

        cfg.setClassForTemplateLoading(MainTest.class, "templates");
      cfg.setIncompatibleImprovements(new Version(2, 3, 20));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setLocale(Locale.US);
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        Map<String, Object> input = new HashMap<String, Object>();

       // input.put("title", "Test example");
        
        List<ValueExampleObject> systems = new ArrayList<ValueExampleObject>();
        
      

        //input.put("exampleObject", new ValueExampleObject("Java object", "me"));
        Template template = cfg.getTemplate("MainTemplate.ftl");

     

        Writer consoleWriter = new OutputStreamWriter(System.out);
        template.process(input, consoleWriter);

        Writer fileWriter = new FileWriter(new File("output.html"));
        try {
        	template.process(input, fileWriter);
        } finally {
            fileWriter.close();
        }
        ScriptEngineManager manager = new ScriptEngineManager();

    }
}
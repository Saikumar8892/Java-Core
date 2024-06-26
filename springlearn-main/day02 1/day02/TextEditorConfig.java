package com.mphasis.day02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig 
{
   @Bean 
   public TextEditor textEditor()
   {
      return new TextEditor(spellChecker());
   }

   @Bean 
   public SpellChecker spellChecker()
   {
      return new SpellChecker();
   }
}

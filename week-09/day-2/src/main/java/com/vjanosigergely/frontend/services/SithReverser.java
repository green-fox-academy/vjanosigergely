package com.vjanosigergely.frontend.services;

import com.vjanosigergely.frontend.Models.SithText;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class SithReverser {

  public SithReverser() {
    List<String> randomWords = new ArrayList<>();
    Random random = new Random();
    randomWords.add("mmm");
    randomWords.add("Arrr");
    randomWords.add("Err..Err..");
    randomWords.add("Bitchcakes");
  }

  public SithText yodaSpeaker(String incomingText) {
    String text = incomingText.replaceAll("\\. ", "\\.").toLowerCase();
    List<String> randomWords = new ArrayList<>();
    Random random = new Random();
    randomWords.add("mmm");
    randomWords.add("Arrr");
    randomWords.add("Err..Err..");
    randomWords.add("Bitchcakes");
    int sentenceCounter = 0;

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == '.') {
        sentenceCounter++;
      }
    }
    String[][] splitText = new String[sentenceCounter][];

    String[] sentences = text.split("\\.");

    for (int i = 0; i < sentenceCounter; i++) {
      splitText[i] = sentences[i].split("\\s");
    }

    SithText sithText = new SithText();
    String toReturn = "";
    for (int i = 0; i < splitText.length; i++) {
      toReturn = toReturn + sithReader(splitText[i]) + " " + randomWords
          .get(random.nextInt(randomWords.size()));
    }

    sithText.setSith_text(toReturn);
    return sithText;
  }

  public String arrayReader(String[] stringArray) {

    String toReturn = "";
    for (int i = 0; i < stringArray.length; i++) {
      if (i == 0) {
        toReturn = toReturn + " " + stringArray[0].substring(0, 1).toUpperCase() + stringArray[0]
            .substring(1);
      } else {
        toReturn = toReturn + " " + stringArray[i];
      }
    }

    return toReturn;
  }

  public String sithReader(String[] stringArray) {
    String toReturn = "";
    String[] yodified = new String[stringArray.length];
    if (stringArray.length % 2 != 0) {
      for (int i = 0; i < (stringArray.length - 1); i = i + 2) {
        yodified[i + 1] = stringArray[i];
      }
      for (int i = 1; i < (stringArray.length - 1); i = i + 2) {
        yodified[i - 1] = stringArray[i];
      }
      yodified[stringArray.length - 1] = stringArray[stringArray.length - 1] + ".";
    } else {
      for (int i = 0; i < (stringArray.length); i = i + 2) {
        yodified[i + 1] = stringArray[i];
      }
      for (int i = 1; i < (stringArray.length); i = i + 2) {
        yodified[i - 1] = stringArray[i];
      }
    }
    toReturn = arrayReader(yodified);

    return toReturn;
  }
}

//it keeps the capital positions and the end of sentences
//if a sentence doesn't contain even number of words, it leaves the last as is
//always puts (one or two) random things at the end of sentences
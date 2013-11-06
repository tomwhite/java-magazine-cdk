/**
 * Copyright 2013 Cloudera Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tom_e_white.javamagazine;

import com.tom_e_white.javamagazine.model.Event;
import java.util.UUID;
import org.apache.log4j.Logger;

public class GenerateEvents {
  public static void main(String... args) throws Exception {
    Logger logger = Logger.getLogger(GenerateEvents.class);
    long i = 0;
    String source = UUID.randomUUID().toString();
    while (true) {
      Event event = new Event();
      event.setId(i++);
      event.setTimestamp(System.currentTimeMillis());
      event.setSource(source);
      logger.info(event);
      Thread.sleep(100);
    }
  }
}
// Source code is decompiled from a .class file using FernFlower decompiler.
package com.fraudsim.engine;

import com.fraudsim.engine.model.Transaction;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class SimulationEngine {
   private static final List<String> MERCHANTS = Arrays.asList("Amazon", "Flipkart", "Myntra", "Swiggy", "Zomato", "Uber", "PaytmMall", "BigBazaar", "CryptoExchange", "LuxuryStore", "Lifestyle", "UnknownVendor", "SuspiciousMerchant");
   private static final List<String> CHANNELS = Arrays.asList("Mobile", "Web", "ATM", "POS");
   private static final List<String> LOCATIONS = Arrays.asList("India", "USA", "UK", "Singapore", "UAE", "Russia", "Syria", "Iran", "North Korea");
   private final Random random = new Random();

   public SimulationEngine() {
   }

   public List<Transaction> generateTransactions(int count, double fraudRate) {
      List<Transaction> list = new ArrayList();

      for(int i = 0; i < count; ++i) {
         Transaction t = new Transaction();
         t.setTxId(UUID.randomUUID().toString());
         int var10001 = this.random.nextInt(900);
         t.setAccountId("ACC" + (var10001 + 100));
         t.setTimestamp(LocalDateTime.now());
         double amount = Math.abs(this.random.nextGaussian() * 1500.0) + 200.0;
         t.setAmount(amount);
         t.setMerchant((String)MERCHANTS.get(this.random.nextInt(MERCHANTS.size())));
         t.setChannel((String)CHANNELS.get(this.random.nextInt(CHANNELS.size())));
         t.setLocation((String)LOCATIONS.get(this.random.nextInt(LOCATIONS.size())));
         t.setRecentTxCount(this.random.nextInt(12));
         t.setFraud(false);
         if (Math.random() < fraudRate) {
            t.setFraud(true);
            int type = this.random.nextInt(4);
            switch (type) {
               case 0:
                  t.setAmount(amount * 8.0 + 10000.0);
                  break;
               case 1:
                  t.setMerchant("SuspiciousMerchant");
                  break;
               case 2:
                  t.setLocation("North Korea");
                  break;
               case 3:
                  t.setRecentTxCount(20);
            }
         }

         list.add(t);
      }

      return list;
   }
}

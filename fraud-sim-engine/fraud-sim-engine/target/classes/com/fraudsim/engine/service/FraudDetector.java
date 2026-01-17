// Source code is decompiled from a .class file using FernFlower decompiler.
package com.fraudsim.engine;

import com.fraudsim.engine.model.Transaction;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class FraudDetector {
   private static final List<String> HIGH_RISK_MERCHANTS = Arrays.asList("CryptoExchange", "LuxuryStore", "SuspiciousMerchant", "UnknownVendor");
   private static final List<String> HIGH_RISK_LOCATIONS = Arrays.asList("Russia", "North Korea", "Iran", "Syria");

   public FraudDetector() {
   }

   public double score(Transaction tx) {
      double score = 0.0;
      if (tx.getAmount() > 20000.0) {
         score += 0.45;
      } else if (tx.getAmount() > 10000.0) {
         score += 0.3;
      } else if (tx.getAmount() > 5000.0) {
         score += 0.15;
      }

      if (HIGH_RISK_MERCHANTS.contains(tx.getMerchant())) {
         score += 0.25;
      }

      if (HIGH_RISK_LOCATIONS.contains(tx.getLocation())) {
         score += 0.25;
      }

      if (tx.getChannel().equalsIgnoreCase("ATM") && tx.getAmount() > 5000.0) {
         score += 0.2;
      }

      if (tx.getChannel().equalsIgnoreCase("WEB") && tx.getAmount() > 15000.0) {
         score += 0.2;
      }

      if (tx.getRecentTxCount() > 5) {
         score += 0.2;
      }

      if (tx.getRecentTxCount() > 10) {
         score += 0.35;
      }

      score += Math.random() * 0.1;
      return Math.min(1.0, score);
   }

   public boolean isFraud(Transaction tx) {
      return this.score(tx) >= 0.6;
   }
}

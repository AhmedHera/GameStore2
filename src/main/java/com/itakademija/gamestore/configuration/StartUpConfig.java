package com.itakademija.gamestore.configuration;

import com.itakademija.gamestore.entity.Product;
import com.itakademija.gamestore.repository.ProductRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

@Configuration
public class StartUpConfig {

    public StartUpConfig(ProductRepository productRepository) {
        var products = productRepository.findAll(PageRequest.of(0, 12));
        if (products.stream().count() == 0) {

            var product = new Product();
            product.setCurrency(Currency.getInstance(Locale.US));
            product.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core i5 6600k ili AMD Ryzen 5 1600\n" +
                    "Memorija: 8 GB RAM\n" +
                    "Grafika: NVIDIA GeForce GTX 1050 Ti ili AMD Radeon RX 570\n" +
                    "Pohrana: 100 GB slobodnog prostora");
            product.setPrice(new BigDecimal("60.00"));
            product.setName("Fifa 23");
            product.setQuantityInStock(23);
            product.setImage("https://www.allkeyshop.com/blog/wp-content/uploads/EA-Confirms-FIFA-23-Is-Coming_featured.png");
            productRepository.save(product);

            var product2 = new Product();
            product2.setCurrency(Currency.getInstance(Locale.US));
            product2.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core i3-4160, 3.6 GHz\n" +
                    "Memorija: 8 GB RAM\n" +
                    "Grafika:  NVIDIA GTX 950 ili AMD Radeon RX 470\n" +
                    "Pohrana: 75 GB slobodnog prostora\n");
            product2.setPrice(new BigDecimal("42.00"));
            product2.setName("Spider-Man Remastered");
            product2.setQuantityInStock(10);
            product2.setImage("https://img.g2a.com/323x433/1x1x0/marvels-spider-man-remastered-ps5-psn-key-europe/081bfa3ad7314bec824d423e");
            productRepository.save(product2);


            var product3 = new Product();
            product3.setCurrency(Currency.getInstance(Locale.US));
            product3.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core i5-2300 ili AMD FX-6350\n" +
                    "Memorija: 8 GB RAM\n" +
                    "Grafika: NVIDIA GeForce GTX 650 Ti, 2 GB | AMD Radeon R7 360, 2 GB\n" +
                    "Pohrana: 10 GB slobodnog prostora\n");
            product3.setPrice(new BigDecimal("42.00"));
            product3.setName("Stray");
            product3.setQuantityInStock(11);
            product3.setImage("https://assets-prd.ignimgs.com/2022/06/04/stray-button-fin-1654302178065.jpg");
            productRepository.save(product3);

            var product4 = new Product();
            product4.setCurrency(Currency.getInstance(Locale.US));
            product4.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Quad core CPU 3.0 GHz\n" +
                    "Memorija: 6 GB RAM\n" +
                    "Grafika:  GeForce GTX 760-class (2 GB)\n" +
                    "Pohrana: 12 GB slobodnog prostora\n");
            product4.setPrice(new BigDecimal("33.50"));
            product4.setName("Euro Truck Simulator 2");
            product4.setQuantityInStock(12);
            product4.setImage("https://cdn130.picsart.com/269122471000211.png");
            productRepository.save(product4);

            var product5 = new Product();
            product5.setCurrency(Currency.getInstance(Locale.US));
            product5.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core 2 Duo E6600 ili AMD Phenom X3 8750\n" +
                    "Memorija: 2 GB RAM\n" +
                    "Grafika:  NVIDIA GTX 950 ili AMD Radeon RX 470\n" +
                    "Pohrana: 15 GB slobodnog prostora\n");
            product5.setPrice(new BigDecimal("28.00"));
            product5.setName("Counter-Strike:Global:Offansive");
            product5.setQuantityInStock(13);
            product5.setImage("https://i.pinimg.com/originals/3f/73/47/3f7347c1a4a72c1b39bc14138c377737.png");
            productRepository.save(product5);

            var product6 = new Product();
            product6.setCurrency(Currency.getInstance(Locale.US));
            product6.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core i5 3470 3.2GHz ili AMD X8 FX-8350 4GHz\n" +
                    "Memorija: 8 GB RAM\n" +
                    "Grafika:  NVIDIA GTX 660 2GB ili AMD HD 7870 2GB\n" +
                    "Pohrana: 72 GB slobodnog prostora\n");
            product6.setPrice(new BigDecimal("44.00"));
            product6.setName("GTA V");
            product6.setQuantityInStock(14);
            product6.setImage("https://pbs.twimg.com/media/Acq8WQKCQAEd96M.png");
            productRepository.save(product6);


            var product7 = new Product();
            product7.setCurrency(Currency.getInstance(Locale.US));
            product7.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core i3-530 2.93GHz ili AMD Phenom II X4 810 2.60GHz\n" +
                    "Memorija: 6 GB RAM\n" +
                    "Grafika:  NVIDIA GeForce GTX 470 1GB ili ATI Radeon HD 6970 1GB\n" +
                    "Pohrana: 100 GB slobodnog prostora\n");
            product7.setPrice(new BigDecimal("27.00"));
            product7.setName("Call of Duty:Black Ops 3");
            product7.setQuantityInStock(14);
            product7.setImage("https://pnggrid.com/wp-content/uploads/2021/11/Call-Of-Duty-Black-OPS-4-Logo.png");
            productRepository.save(product7);


            var product8 = new Product();
            product8.setCurrency(Currency.getInstance(Locale.US));
            product8.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Ryzen 5 CPU\n" +
                    "Memorija: 8 GB RAM\n" +
                    "Grafika:  AMD Radeon R9 290 ili NVIDIA GeForce GTX 970\n" +
                    "Pohrana: 56 GB slobodnog prostora\n");
            product8.setPrice(new BigDecimal("45.00"));
            product8.setName("Apex Legends");
            product8.setQuantityInStock(15);
            product8.setImage("https://i.pinimg.com/originals/85/7a/ef/857aef3607c0d938b5059b9ae24c4095.png");
            productRepository.save(product8);


            var product9 = new Product();
            product9.setCurrency(Currency.getInstance(Locale.US));
            product9.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core i5-6600K ili AMD Ryzen 5 1600\n" +
                    "Memorija: 16 GB RAM\n" +
                    "Grafika:  NVIDIA GeForce GTX 1060 3GB ili AMD Radeon RX 580 4GB\n" +
                    "Pohrana: 50 GB slobodnog prostora\n");
            product9.setPrice(new BigDecimal("32.00"));
            product9.setName("PUBG:BATTLEGROUNDS");
            product9.setQuantityInStock(16);
            product9.setImage("https://www.logopik.com/wp-content/uploads/edd/2020/08/PUBG-Mobile-Logo-Vector.png");
            productRepository.save(product9);

            var product10 = new Product();
            product10.setCurrency(Currency.getInstance(Locale.US));
            product10.setDescription("OS: Windows 11 64-bit\n" +
                    "Procesor: Intel Core i7-4790K ili AMD Ryzen 5 1600\n" +
                    "Memorija: 16 GB RAM\n" +
                    "Grafika:  GTX 980 ili AMD R9 Fury\n" +
                    "Pohrana: 25 GB slobodnog prostora\n");
            product10.setPrice(new BigDecimal("50.00"));
            product10.setName("Rust");
            product10.setQuantityInStock(17);
            product10.setImage("https://i.pinimg.com/736x/94/64/6a/94646abece675be28d75439327f4f5ec--rust-logos.jpg");
            productRepository.save(product10);

            var product11 = new Product();
            product11.setCurrency(Currency.getInstance(Locale.US));
            product11.setDescription("OS: Windows 10 64-bit\n" +
                    "Procesor: Intel Core i5-2400 ili AMD FX-8320\n" +
                    "Memorija: 8 GB RAM\n" +
                    "Grafika:  NVIDIA GTX 670 2GB ili AMD Radeon HD 7870 2GB\n" +
                    "Pohrana: 60 GB slobodnog prostora\n");
            product11.setPrice(new BigDecimal("47.00"));
            product11.setName("ARK:Survival Evolved");
            product11.setQuantityInStock(18);
            product11.setImage("https://i.pinimg.com/originals/1d/01/30/1d01304174bbe64965d47559c61470cb.png");
            productRepository.save(product11);

            var product12 = new Product();
            product12.setCurrency(Currency.getInstance(Locale.US));
            product12.setDescription("OS: Windows 7 64-bit\n" +
                    "Procesor: Quad Core Procesor\n" +
                    "Memorija: 4 GB RAM\n" +
                    "Grafika:  NVIDIA GeForce GTX 560\n" +
                    "Pohrana: 5 GB slobodnog prostora\n");
            product12.setPrice(new BigDecimal("19.00"));
            product12.setName("The Forest");
            product12.setQuantityInStock(19);
            product12.setImage("https://pbs.twimg.com/profile_images/480100168818106368/SkCIkK5v_400x400.png");
            productRepository.save(product12);
        }
    }
}

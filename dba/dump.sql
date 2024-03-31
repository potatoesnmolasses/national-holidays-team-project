-- MySQL dump 10.13  Distrib 8.0.36, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: holiday_wizard
-- ------------------------------------------------------
-- Server version	8.0.36-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `holiday`
--

DROP TABLE IF EXISTS `holiday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `holiday` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=433 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `holiday`
--

LOCK TABLES `holiday` WRITE;
/*!40000 ALTER TABLE `holiday` DISABLE KEYS */;
INSERT INTO `holiday` VALUES (1,'Polar Bear Plunge Day','1970-01-01'),(2,'Buffet Day','1970-01-02'),(3,'Run It up the Flagpole and See If Anyone Salutes It Day','1970-01-02'),(4,'Science Fiction Day','1970-01-02'),(5,'Fruitcake Toss Day','1970-01-03'),(6,'Festival of Sleep Day','1970-01-03'),(7,'Trivia Day','1970-01-04'),(8,'Bird Day','1970-01-05'),(9,'Bean Day','1970-01-06'),(10,'Old Rock Day','1970-01-07'),(11,'Earth\'s Rotation Day','1970-01-08'),(12,'Clean Off Your Desk Day','1970-01-08'),(13,'Static Electricity Day','1970-01-09'),(14,'Word Nerd Day','1970-01-09'),(15,'Cut Your Energy Costs Day','1970-01-10'),(16,'Learn Your Name in Morse Code Day','1970-01-11'),(17,'Marzipan Day','1970-01-12'),(18,'Make Your Dreams Come True Day','1970-01-13'),(19,'Organize Your Home Day','1970-01-14'),(20,'Strawberry Ice Cream Day','1970-01-15'),(21,'Bagel and Lox Day','1970-01-15'),(22,'Nothing Day','1970-01-16'),(23,'Benjamin Franklin Day','1970-01-17'),(24,'Kid Inventors\' Day','1970-01-17'),(25,'Ditch New Year\'s Resolution Day','1970-01-17'),(26,'Thesaurus Day','1970-01-18'),(27,'Tin Can Day','1970-01-19'),(28,'Popcorn Day','1970-01-19'),(29,'Soup Swap Day','1970-01-20'),(30,'Penguin Awareness Day','1970-01-20'),(31,'Squirrel Appreciation Day','1970-01-21'),(32,'Hot Sauce Day','1970-01-22'),(33,'Answer Your Cat\'s Questions Day','1970-01-22'),(34,'Handwriting Day','1970-01-23'),(35,'Compliment Day','1970-01-24'),(36,'Macintosh Computer Day','1970-01-24'),(37,'Opposite Day','1970-01-25'),(38,'Spouse\'s Day','1970-01-26'),(39,'Chocolate Cake Day','1970-01-27'),(40,'e-Day','1970-01-27'),(41,'Data Privacy Day','1970-01-28'),(42,'Fun at Work Day','1970-01-28'),(43,'Puzzle Day','1970-01-29'),(44,'Croissant Day','1970-01-30'),(45,'Backwards Day','1970-01-31'),(46,'Work Naked Day','1970-02-02'),(47,'Day of the Crêpe','1970-02-02'),(48,'Play Your Ukulele Day','1970-02-02'),(49,'Eat Ice Cream for Breakfast Day','1970-02-03'),(50,'Carrot Cake Day','1970-02-03'),(51,'Thank Your Mailman Day','1970-02-04'),(52,'Create a Vacuum Day','1970-02-04'),(53,'Stuffed Mushroom Day','1970-02-04'),(54,'National Weatherperson\'s Day','1970-02-05'),(55,'Chocolate Fondue Day','1970-02-05'),(56,'Lame Duck Day','1970-02-06'),(57,'e-Day','1970-02-07'),(58,'Send a Card to a Friend Day','1970-02-07'),(59,'Laugh and Get Rich Day','1970-02-08'),(60,'Toothache Day','1970-02-09'),(61,'Bagel and Lox Day','1970-02-09'),(62,'Umbrella Day','1970-02-10'),(63,'Make a Friend Day','1970-02-11'),(64,'Don\'t Cry Over Spilled Milk Day','1970-02-11'),(65,'Clean Out Your Computer Day','1970-02-12'),(66,'Darwin Day','1970-02-12'),(67,'World Radio Day','1970-02-13'),(68,'Ferris Wheel Day','1970-02-14'),(69,'Library Lovers Day','1970-02-14'),(70,'Gumdrop Day','1970-02-15'),(71,'Do a Grouch a Favor Day','1970-02-16'),(72,'Random Act of Kindness Day','1970-02-17'),(73,'Battery Day','1970-02-18'),(74,'Chocolate Mint Day','1970-02-19'),(75,'Single Tasking Day','1970-02-22'),(76,'Be Humble Day','1970-02-22'),(77,'International Dog Biscuit Appreciation Day','1970-02-23'),(78,'Tortilla Chip Day','1970-02-24'),(79,'World Sword Swallowers Day','1970-02-24'),(80,'Pistachio Day','1970-02-26'),(81,'Tell a Fairy Tale Day','1970-02-26'),(82,'International Polar Bear Day','1970-02-27'),(83,'No Brainer Day','1970-02-27'),(84,'Public Sleeping Day','1970-02-28'),(85,'World Compliment Day','1970-03-01'),(86,'Plan a Solo Vacation Day','1970-03-01'),(87,'Old Stuff Day','1970-03-02'),(88,'I Want You to be Happy Day','1970-03-03'),(89,'March Forth and Do Something Day','1970-03-04'),(90,'Learn What Your Name Means Day','1970-03-05'),(91,'Cinco de Marcho','1970-03-05'),(92,'Dentist’s Day','1970-03-06'),(93,'Alexander Graham Bell Day','1970-03-07'),(94,'Proofreading Day','1970-03-08'),(95,'Mario Day','1970-03-10'),(96,'Napping Day','1970-03-11'),(97,'Oatmeal Nut Waffle Day','1970-03-11'),(98,'Alfred Hitchcock Day','1970-03-12'),(99,'Jewel Day','1970-03-13'),(100,'Pi Day','1970-03-14'),(101,'Everything You Think is Wrong Day','1970-03-15'),(102,'Every Thing You Do is Right Day','1970-03-16'),(103,'Submarine Day','1970-03-17'),(104,'Awkward Moments Day','1970-03-18'),(105,'Let\'s Laugh Day','1970-03-19'),(106,'World Storytelling Day','1970-03-20'),(107,'Proposal Day','1970-03-20'),(108,'Absolutely Incredible Kid Day','1970-03-21'),(109,'Common Courtesy Day','1970-03-21'),(110,'International Goof Off Day','1970-03-22'),(111,'Puppy Day','1970-03-23'),(112,'Near Miss Day','1970-03-23'),(113,'Chocolate Covered Raisins Day','1970-03-24'),(114,'Waffle Day','1970-03-25'),(115,'Tolkien Reading Day','1970-03-25'),(116,'Make Up Your Own Holiday Day','1970-03-26'),(117,'Spanish Paella Day','1970-03-27'),(118,'Something on a Stick Day','1970-03-28'),(119,'Smoke and Mirrors Day','1970-03-29'),(120,'Take a Walk in the Park Day','1970-03-30'),(121,'Bunsen Burner Day','1970-03-31'),(122,'Fun at Work Day','1970-04-01'),(123,'World Party Day','1970-04-03'),(124,'Tell a Lie Day','1970-04-04'),(125,'Walk to Work Day','1970-04-05'),(126,'Read a Road Map Day','1970-04-05'),(127,'First Contact Day','1970-04-05'),(128,'Sorry Charlie Day','1970-04-06'),(129,'Be Kind to Lawyers Day','1970-04-09'),(130,'Siblings Day','1970-04-10'),(131,'Submarine Day','1970-04-11'),(132,'Barbershop Quartet Day','1970-04-11'),(133,'Grilled Cheese Day','1970-04-12'),(134,'Yuri\'s Night','1970-04-12'),(135,'Scrabble Day','1970-04-13'),(136,'International Moment of Laughter Day','1970-04-14'),(137,'Reach as High as You Can Day','1970-04-14'),(138,'Look up the Sky Day','1970-04-14'),(139,'Eggs Benedict Day','1970-04-16'),(140,'Wear Pajamas to Work Day','1970-04-16'),(141,'Haiku Poetry Day','1970-04-17'),(142,'Columnist Day','1970-04-18'),(143,'Look Alike Day','1970-04-20'),(144,'Jelly Bean Day','1970-04-22'),(145,'Take a Chance Day','1970-04-23'),(146,'Impossible Astronaut Day','1970-04-23'),(147,'Lover\'s Day','1970-04-23'),(148,'Take Our Daughters and Sons to Work Day','1970-04-25'),(149,'DNA Day','1970-04-25'),(150,'Pretzel Day','1970-04-26'),(151,'Richter Scale Day','1970-04-26'),(152,'World Pinhole Photography Day','1970-04-28'),(153,'Zipper Day','1970-04-29'),(154,'Honesty Day','1970-04-30'),(155,'Batman Day','1970-05-01'),(156,'No Pants Day','1970-05-03'),(157,'Space Day','1970-05-03'),(158,'Herb Day','1970-05-04'),(159,'Free Comic Book Day','1970-05-04'),(160,'Star Wars Day','1970-05-04'),(161,'Beverage Day','1970-05-06'),(162,'National School Nurse Day','1970-05-08'),(163,'Europe Day','1970-05-09'),(164,'Lost Sock Memorial Day','1970-05-09'),(165,'Clean Up Your Room Day','1970-05-10'),(166,'Twilight Zone Day','1970-05-11'),(167,'Eat What You Want Day','1970-05-11'),(168,'Limerick Day','1970-05-12'),(169,'Frog Jumping Day','1970-05-13'),(170,'Dance Like a Chicken Day','1970-05-14'),(171,'Chocolate Chip Day','1970-05-15'),(172,'Pizza Party Day','1970-05-17'),(173,'Pack Rat Day','1970-05-17'),(174,'Astronomy Day','1970-05-18'),(175,'No Dirty Dishes Day','1970-05-18'),(176,'May Ray Day','1970-05-19'),(177,'Be a Millionaire Day','1970-05-20'),(178,'Talk Like Yoda Day','1970-05-21'),(179,'Buy a Musical Instrument Day','1970-05-22'),(180,'Scavenger Hunt Day','1970-05-24'),(181,'Sing Out Day','1970-05-25'),(182,'Towel Day','1970-05-25'),(183,'World Lindy Hop Day','1970-05-26'),(184,'Sun Screen Day','1970-05-27'),(185,'Hamburger Day','1970-05-28'),(186,'Put a Pillow on Your Fridge Day','1970-05-29'),(187,'My Bucket\'s Got a Hole Day','1970-05-30'),(188,'Macaroon Day','1970-05-31'),(189,'Say Something Nice Day','1970-06-01'),(190,'Leave the Office Early Day','1970-06-02'),(191,'Leave the Office Early Day','1970-06-03'),(192,'Repeat Day','1970-06-03'),(193,'Hug Your Cat Day','1970-06-04'),(194,'Drive-In Movie Day','1970-06-06'),(195,'VCR Day','1970-06-07'),(196,'National Doughnut Day','1970-06-07'),(197,'Best Friends Day','1970-06-08'),(198,'Donald Duck Day','1970-06-09'),(199,'Iced Tea Day','1970-06-10'),(200,'Corn on the Cob Day','1970-06-11'),(201,'Red Rose Day','1970-06-12'),(202,'Sewing Machine Day','1970-06-13'),(203,'Bourbon Day','1970-06-14'),(204,'World Juggling Day','1970-06-15'),(205,'Nature Photography Day','1970-06-15'),(206,'Bloomsday','1970-06-16'),(207,'Eat Your Vegetables Day','1970-06-17'),(208,'International Picnic Day','1970-06-18'),(209,'International Panic Day','1970-06-18'),(210,'Sauntering Day','1970-06-19'),(211,'Take Your Dog to Work Day','1970-06-21'),(212,'Daylight Appreciation Day','1970-06-21'),(213,'Onion Ring Day','1970-06-22'),(214,'Typewriter Day','1970-06-23'),(215,'Swim a Lap Day','1970-06-24'),(216,'Please Take my Children to Work Day','1970-06-25'),(217,'Chocolate Pudding Day','1970-06-26'),(218,'Helen Keller Day','1970-06-27'),(219,'Tau Day','1970-06-28'),(220,'Camera Day','1970-06-29'),(221,'Meteor Watch Day','1970-06-30'),(222,'International Joke Day','1970-07-01'),(223,'I Forgot Day','1970-07-02'),(224,'World UFO Day','1970-07-02'),(225,'Compliment Your Mirror Day','1970-07-03'),(226,'International Plastic Bag Free Day','1970-07-03'),(227,'Sidewalk Egg Frying Day','1970-07-04'),(228,'Workaholics Day','1970-07-05'),(229,'World Kissing Day','1970-07-06'),(230,'Tell the Truth Day','1970-07-07'),(231,'Video Games Day','1970-07-08'),(232,'Math 2.0 Day','1970-07-08'),(233,'Sugar Cookie Day','1970-07-09'),(234,'Teddy Bears\' Picnic Day','1970-07-10'),(235,'Clerihew Day','1970-07-10'),(236,'Cheer Up the Lonely Day','1970-07-11'),(237,'Simplicity Day','1970-07-12'),(238,'Embrace Your Geekness Day','1970-07-13'),(239,'Pandemonium Day','1970-07-14'),(240,'Gummi Worm Day','1970-07-15'),(241,'Corn Fritters Day','1970-07-16'),(242,'Yellow Pig Day','1970-07-17'),(243,'Emoji Day','1970-07-17'),(244,'Insurance Nerd Day','1970-07-18'),(245,'Caviar Day','1970-07-18'),(246,'Stick Out Your Tongue Day','1970-07-19'),(247,'Space Exploration Day','1970-07-20'),(248,'Ice Cream Day','1970-07-21'),(249,'Junk Food Day','1970-07-21'),(250,'Pi Approximation Day','1970-07-22'),(251,'Vanilla Ice Cream Day','1970-07-23'),(252,'Cousins Day','1970-07-24'),(253,'Culinarians Day','1970-07-25'),(254,'Uncle and Aunt Day','1970-07-26'),(255,'Take your Pants for a Walk Day','1970-07-27'),(256,'Milk Chocolate Day','1970-07-28'),(257,'Lasagna Day','1970-07-29'),(258,'National Cheesecake Day','1970-07-30'),(259,'Uncommon Musical Instrument Day','1970-07-31'),(260,'National Girlfriend Day','1970-08-01'),(261,'Ice Cream Sandwich Day','1970-08-02'),(262,'International Beer Day','1970-08-02'),(263,'Watermelon Day','1970-08-03'),(264,'Sisters\' Day','1970-08-04'),(265,'Single Working Women\'s Day','1970-08-04'),(266,'Work Like a Dog Day','1970-08-05'),(267,'Fresh Breath Day','1970-08-06'),(268,'Lighthouse Day','1970-08-07'),(269,'Happiness Happens Day','1970-08-08'),(270,'Book Lovers Day','1970-08-09'),(271,'Lazy Day','1970-08-10'),(272,'Son and Daughter Day','1970-08-11'),(273,'Middle Child Day','1970-08-12'),(274,'Left-Handers Day','1970-08-13'),(275,'Creamsicle Day','1970-08-14'),(276,'Relaxation Day','1970-08-15'),(277,'Tell a Joke Day','1970-08-16'),(278,'Thrift Shop Day','1970-08-17'),(279,'Mail Order Catalog Day','1970-08-18'),(280,'World Photo Day','1970-08-19'),(281,'Chocolate Pecan Pie Day','1970-08-20'),(282,'Spumoni Day','1970-08-21'),(283,'Be An Angel Day','1970-08-22'),(284,'Ride Like the Wind Day','1970-08-23'),(285,'Pluto Demoted Day','1970-08-24'),(286,'Kiss and Make up Day','1970-08-25'),(287,'Dog Appreciation Day','1970-08-26'),(288,'The Duchess Who Wasn\'t Day','1970-08-27'),(289,'Bow Tie Day','1970-08-28'),(290,'According to Hoyle Day','1970-08-29'),(291,'Frankenstein Day','1970-08-30'),(292,'Eat Outside Day','1970-08-31'),(293,'Emma Nutt Day','1970-09-01'),(294,'No Rhyme or Reason Day','1970-09-01'),(295,'Bison Ten Yell Day','1970-09-02'),(296,'Skyscraper Day','1970-09-03'),(297,'Eat an Extra Dessert Day','1970-09-04'),(298,'Be Late for Something Day','1970-09-05'),(299,'Cheese Pizza Day','1970-09-05'),(300,'Fight Procrastination Day','1970-09-06'),(301,'Read a Book Day','1970-09-06'),(302,'Salami Day','1970-09-07'),(303,'Pardon Day','1970-09-08'),(304,'Hug Your Hound Day','1970-09-08'),(305,'Teddy Bear Day','1970-09-09'),(306,'Swap Ideas Day','1970-09-10'),(307,'Make Your Bed Day','1970-09-11'),(308,'Chocolate Milkshake Day','1970-09-12'),(309,'Positive Thinking Day','1970-09-13'),(310,'Roald Dahl Day','1970-09-13'),(311,'Make a Hat Day','1970-09-15'),(312,'Collect Rocks Day','1970-09-16'),(313,'Guacamole Day','1970-09-16'),(314,'International Country Music Day','1970-09-17'),(315,'Rice Krispie Treat Day','1970-09-18'),(316,'National Gymnastics Day','1970-09-19'),(317,'International Talk Like a Pirate Day','1970-09-19'),(318,'Punch Day','1970-09-20'),(319,'National CleanUp Day','1970-09-21'),(320,'Miniature Golf Day','1970-09-21'),(321,'Hobbit Day','1970-09-22'),(322,'Checkers Day','1970-09-23'),(323,'Punctuation Day','1970-09-24'),(324,'Comic Book Day','1970-09-25'),(325,'Love Note Day','1970-09-26'),(326,'Crush a Can Day','1970-09-27'),(327,'Ask a Stupid Question Day','1970-09-28'),(328,'Good Neighbor Day','1970-09-28'),(329,'Hot Mulled Cider Day','1970-09-30'),(330,'International Coffee Day','1970-10-01'),(331,'Balloons Around the World Day','1970-10-01'),(332,'Phileas Fogg Wager Day','1970-10-02'),(333,'World Smile Day','1970-10-04'),(334,'Taco Day','1970-10-04'),(335,'Card Making Day','1970-10-05'),(336,'Chic Spy Day','1970-10-05'),(337,'Mad Hatter Day','1970-10-06'),(338,'Frappé Day','1970-10-07'),(339,'Pierogi Day','1970-10-08'),(340,'Ada Lovelace Day','1970-10-08'),(341,'Curious Events Day','1970-10-09'),(342,'Handbag Day','1970-10-10'),(343,'It\'s My Party Day','1970-10-11'),(344,'Astronomy Day','1970-10-12'),(345,'Old Farmers Day','1970-10-12'),(346,'International Skeptics Day','1970-10-13'),(347,'I Love Lucy Day','1970-10-15'),(348,'Dictionary Day','1970-10-16'),(349,'Wear Something Gaudy Day','1970-10-17'),(350,'Chocolate Cupcake Day','1970-10-18'),(351,'Sweetest Day','1970-10-19'),(352,'International Sloth Day','1970-10-20'),(353,'National Clean Out Your Virtual Desktop Day','1970-10-21'),(354,'Count your Buttons Day','1970-10-21'),(355,'Caps Lock Day','1970-10-22'),(356,'Mole Day','1970-10-23'),(357,'Bologna Day','1970-10-24'),(358,'Sourest Day','1970-10-25'),(359,'Howl at the Moon Day and Night','1970-10-26'),(360,'American Beer Day','1970-10-27'),(361,'International Animation Day','1970-10-28'),(362,'Internet Day','1970-10-29'),(363,'Candy Corn Day','1970-10-30'),(364,'Magic Day','1970-10-31'),(365,'Author\'s Day','1970-11-01'),(366,'Deviled Eggs Day','1970-11-02'),(367,'Zero Tasking Day','1970-11-03'),(368,'Sandwich Day','1970-11-03'),(369,'Common Sense Day','1970-11-04'),(370,'Saxophone Day','1970-11-06'),(371,'Men Make Dinner Day','1970-11-07'),(372,'International Stout Day','1970-11-07'),(373,'Bittersweet Chocolate with Almonds Day','1970-11-07'),(374,'Tongue Twister Day','1970-11-08'),(375,'Chaos Never Dies Day','1970-11-09'),(376,'Forget Me Not Day','1970-11-10'),(377,'Vanilla Cupcake Day','1970-11-10'),(378,'Origami Day','1970-11-11'),(379,'Happy Hour Day','1970-11-12'),(380,'World Kindness Day','1970-11-13'),(381,'Sadie Hawkins Day','1970-11-13'),(382,'Spicy Guacamole Day','1970-11-14'),(383,'Pickle Day','1970-11-14'),(384,'Clean Out Your Refrigerator Day','1970-11-15'),(385,'Fast Food Day','1970-11-16'),(386,'Take A Hike Day','1970-11-17'),(387,'Push Button Phone Day','1970-11-18'),(388,'National Absurdity Day','1970-11-20'),(389,'Use Less Stuff Day','1970-11-21'),(390,'World Hello Day','1970-11-21'),(391,'Go For a Ride Day','1970-11-22'),(392,'Buy Nothing Day','1970-11-22'),(393,'Fibonacci Day','1970-11-23'),(394,'Celebrate Your Unique Talent Day','1970-11-24'),(395,'Shopping Reminder Day','1970-11-25'),(396,'Cake Day','1970-11-26'),(397,'Red Planet Day','1970-11-28'),(398,'Electronic Greeting Card Day','1970-11-29'),(399,'Computer Security Day','1970-11-30'),(400,'Eat a Red Apple Day','1970-12-01'),(401,'Fritters Day','1970-12-02'),(402,'Make a Gift Day','1970-12-03'),(403,'Wear Brown Shoes Day','1970-12-04'),(404,'Day of the Ninja','1970-12-05'),(405,'Put on Your Own Shoes Day','1970-12-06'),(406,'Microwave Oven Day','1970-12-06'),(407,'Letter Writing Day','1970-12-07'),(408,'Pretend to Be a Time Traveler Day','1970-12-08'),(409,'Christmas Card Day','1970-12-09'),(410,'Dewey Decimal System Day','1970-12-10'),(411,'Jane Addams Day','1970-12-10'),(412,'Noodle Ring Day','1970-12-11'),(413,'Gingerbread House Day','1970-12-12'),(414,'Official Lost and Found Day','1970-12-13'),(415,'Monkey Day','1970-12-14'),(416,'Chocolate Covered Anything Day','1970-12-16'),(417,'Wright Brothers Day','1970-12-17'),(418,'Underdog Day','1970-12-20'),(419,'Ugly Sweater Day','1970-12-20'),(420,'Sangria Day','1970-12-20'),(421,'International Dalek Remembrance Day','1970-12-21'),(422,'Date Nut Bread Day','1970-12-22'),(423,'Festivus','1970-12-23'),(424,'Eggnog Day','1970-12-24'),(425,'Grav Mass Day','1970-12-25'),(426,'A\'phabet Day or No \"L\" Day','1970-12-25'),(427,'Thank You Note Day','1970-12-26'),(428,'No Interruptions Day','1970-12-27'),(429,'Card Playing Day','1970-12-28'),(430,'Pepper Pot Day','1970-12-29'),(431,'Bicarbonate of Soda Day','1970-12-30'),(432,'Make Up Your Mind Day','1970-12-31');
/*!40000 ALTER TABLE `holiday` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-30 19:50:38

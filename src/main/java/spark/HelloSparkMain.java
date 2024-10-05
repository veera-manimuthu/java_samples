/**
 * 
 */
package spark;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

/**
 * 
 */
public class HelloSparkMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SparkConf conf = new SparkConf().setMaster("local[*]").setAppName("HelloSpark")
				.set("spark.driver.host", "localhost");
		JavaSparkContext sparkContext = new JavaSparkContext(conf);
		JavaRDD<String> input = sparkContext.textFile("C:\\Users\\veera\\DevWorks\\numberx.txt");
		JavaRDD<String> numberStrings = input.flatMap(s -> Arrays.asList(s.split(" ")).iterator());
		JavaRDD<Integer> numberIntegers = numberStrings.map(ns -> Integer.valueOf(ns));
		int finalSum = numberIntegers.reduce((x, y) -> x + y);
		System.out.println(finalSum);
		sparkContext.close();
		 

		SparkConf conf1 = new SparkConf().setMaster("local[*]").setAppName("Hiii")
				.set("spark.driver.host", "localhost");

		SparkSession sparkSession = SparkSession.builder().config(conf1).getOrCreate();
		System.out.println(sparkSession.version());
	}

}

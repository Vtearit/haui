package com.javadeveloperzone.bigdata.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class WordCountDriver extends Configured implements Tool{

	@Override
	public int run(String[] args) throws Exception {
		
		Configuration configuration = getConf();
		
		Job job = Job.getInstance(configuration, "WordCountJob");
		
		job.setJarByClass(WordCountDriver.class);
		
		job.setMapperClass(WordCountMapper.class);
		
		job.setReducerClass(WordCountReducer.class);
		
		job.setOutputKeyClass(Text.class);
		
		job.setOutputValueClass(IntWritable.class);
		
		/*Passing First argument as Input Path*/
		FileInputFormat.setInputPaths(job, new Path(args[0]));
		
		/*Passing Second argument as Output Path*/
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		job.waitForCompletion(true);

		return job.isSuccessful() ? 0 : 1;
	}
	
	public static void main(String[] args) throws Exception {
		
		int result = ToolRunner.run(new Configuration(), new WordCountDriver(), args);
		
		if(result==0){
			System.out.println("Job Completed successfully...");
		}
		else{
			System.out.println("Job Execution Failed with status::"+result);
		}
		
	}

}

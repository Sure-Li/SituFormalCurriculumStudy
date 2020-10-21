package com.situ.lession10;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		long free = runtime.maxMemory();
		System.out.println(free / (1024 * 1024));
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		try {
			Process process = runtime.exec("E:\\BiliBili视频下载工具\\BiliBili视频下载工具 3.0（MP4+Flv）.exe"); // java写单机视频
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			process.destroy();//关闭线程
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

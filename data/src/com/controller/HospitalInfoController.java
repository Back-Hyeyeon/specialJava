package com.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.vo.HospitalVO;

public class HospitalInfoController {
	private List<HospitalVO> list = new ArrayList();

	public void inputData() {
		File data = new File("hospitaldata.csv");
		StringBuffer sb = new StringBuffer();

		FileReader fr = null;
		try {
			fr = new FileReader(data);
			BufferedReader breader = new BufferedReader(fr);
			String ch = null;
			while((ch = breader.readLine()) != null) {
				sb.append(ch+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		String[] datas = sb.toString().split("\n");
		for(String d:datas) {
			String[] detail = d.split(",");
			int count = 0;
			try {
				count = Integer.parseInt(detail[16]);
				list.add(new HospitalVO(detail[3],detail[1],detail[5],detail[7],
						detail[10],detail[11],detail[12],detail[13],count));
				
			} catch(Exception e) {
				
			}
			
		}
		list.remove(0);
	}
	
	public void prinHospitalData() {
		System.out.printf("종류\t병원명\t\t\t시도명\t\t시군구명\t\t주소\t\t\t\t\t"
				+ "전화번호\t\t홈페이지주소\t\t개설일\t총의사수\n");
		for(HospitalVO h:list) {
			if(h.getCategory().equals("종합병원")) {
				System.out.printf("%-5s %-30s %-10s %-10s %-30s %-10s %-40s %-20s %-4d\n",
						h.getCategory(),h.getHospitalName(),h.getStateCode(),h.getCityCode(),
						h.getAddress(),h.getPhone(),h.getSite(),h.getOpenDate(),h.getDoctorCount());
			}
		}
	}
	
	
	
	
	
}
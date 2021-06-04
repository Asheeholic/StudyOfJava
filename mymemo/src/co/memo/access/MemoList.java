package co.memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.memo.model.Memo;

public class MemoList implements MemoAccess{
	ArrayList<Memo> memos;
	
	String path = "d:/temp/memo.txt";
	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (true) {
				if(! scanner.hasNext()) break;
				String str = scanner.nextLine();
				String[] arr = str.split(" : ");
				memos.add(new Memo(arr[0], arr[1]));
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void save() {
		try {
			BufferedWriter fw = new  BufferedWriter(new FileWriter(path));
			for(Memo f : memos) {
				fw.write(String.format("%s : %s\n",
										f.getDate(),
										f.getContent()));
			}
			fw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public MemoList() {
		memos = new ArrayList<Memo>();
		open();
	}
	
	@Override
	public void insert(Memo memo) {
		// TODO Auto-generated method stub
		memos.add(memo);
		save();		
	}

	@Override
	public void update(Memo memo) {
		// TODO Auto-generated method stub
		for (Memo m : memos) {
			if (m.getDate().equals(memo.getDate())) { // 
				m.setContent(memo.getContent());
				save();
			}
		}
	}

	@Override
	public void delete(String date) {
		// TODO Auto-generated method stub
		for (Memo m : memos) {
			if (m.getDate().equals(date)) {
				memos.remove(m);
				save();
				break;
			}
		}
	}

	@Override
	public ArrayList<Memo> selectAll() {
		// TODO Auto-generated method stub
		return memos;
	}

	@Override
	public Memo selectOne(String date) {
		// TODO Auto-generated method stub
		for (Memo m : memos) {
			if (m.getDate().equals(date)) { // contains
				return m;
			}
		}
		return null;
	}

	@Override
	public Memo findContent(String content) {
		// TODO Auto-generated method stub
		for (Memo f : memos) {
			if (f.getContent().contains(content)) { // contains
				return f;
			}
		}
		return null;
	}

}

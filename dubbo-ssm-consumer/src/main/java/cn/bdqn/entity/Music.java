package cn.bdqn.entity;

import java.io.Serializable;

/**
 *  音乐
 * @author yinya
 *
 */
public class Music implements Serializable {
	
		private   int  id;
		private String  singer_name;
		private String music_size;
		private String music_name;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSinger_name() {
			return singer_name;
		}
		public void setSinger_name(String singer_name) {
			this.singer_name = singer_name;
		}
		public String getMusic_size() {
			return music_size;
		}
		public void setMusic_size(String music_size) {
			this.music_size = music_size;
		}
		public String getMusic_name() {
			return music_name;
		}
		public void setMusic_name(String music_name) {
			this.music_name = music_name;
		}
		
		
}

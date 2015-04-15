package com.laudandjolynn.mytv;

import java.util.List;

import com.laudandjolynn.mytv.model.ProgramTable;
import com.laudandjolynn.mytv.model.TvStation;

/**
 * @author: Laud
 * @email: htd0324@gmail.com
 * @date: 2015年4月15日 下午3:36:28
 * @copyright: www.laudandjolynn.com
 */
public interface TvCrawler {
	/**
	 * 抓取所有电视台
	 * 
	 * @return
	 */
	public List<TvStation> crawlAllTvStation();

	/**
	 * 根据日期抓取电视节目表
	 * 
	 * @param date
	 * @return
	 */
	public List<ProgramTable> crawlAllProgramTable(String date);

	/**
	 * 根据电视台名称、日期抓取电视节目表
	 * 
	 * @param stationName
	 * @param date
	 * @return
	 */
	public List<ProgramTable> crawlProgramTable(String stationName, String date);
}

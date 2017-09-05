package com.util.tools;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
/**
 * ���ػ������ڸ�������ʹ��
 * @author Jie
 *
 */
public class TockenCache {
	private static Logger logger = LoggerFactory.getLogger(TockenCache.class);

	private static LoadingCache<String, String> localCache = CacheBuilder.
			newBuilder().
			initialCapacity(1000)//��ʼ��1000
			.maximumSize(10000)
			.expireAfterAccess(12, TimeUnit.HOURS)//��Ч��12Сʱ
			.build(new CacheLoader<String, String>() {
				// Ĭ�ϵ����ݼ���ʵ��,������getȡֵ��ʱ��,���keyû�ж�Ӧ��ֵ,�͵�������������м���.
				@Override
				public String load(String s) throws Exception {
					// log.debug("");
					return "null";
				}
			});

	public static void setKey(String key, String value) {
		localCache.put(key, value);
	}

	public static String getKey(String key) {
		String value = null;
		try {
			value = localCache.get(key);
			if ("null".equals(value)) {
				return null;
			}
			return value;
		} catch (Exception e) {
			logger.error("localCache get error", e);
		}
		return null;
	}
}

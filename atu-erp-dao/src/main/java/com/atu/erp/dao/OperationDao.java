package com.atu.erp.dao;

import com.atu.erp.domain.Comment;
import com.atu.erp.domain.ForbiddenUsers;
import com.atu.erp.domain.Hotwords;
import com.atu.erp.domain.query.CommentQuery;
import com.atu.erp.domain.query.ForbiddenUsersQuery;
import com.atu.erp.domain.query.HotwordsQuery;

import java.util.List;

public abstract interface OperationDao {
	public abstract Integer insert(Hotwords paramHotwords);

	public abstract void modify(Hotwords paramHotwords);
	public abstract void modifyComment(CommentQuery commentQuery);
	public abstract Hotwords selectByHotwordsId(int paramInt);

	public abstract int countByCondition(HotwordsQuery paramHotwordsQuery);

	public abstract List<Hotwords> selectByCondition(
			HotwordsQuery paramHotwordsQuery);

	public abstract List<Hotwords> selectByConditionForPage(
			HotwordsQuery paramHotwordsQuery);

	public abstract List<Hotwords> selectByLikeCondition(
			HotwordsQuery paramHotwordsQuery);

	public abstract void deleteHotwords(Integer paramInteger);

	public abstract void deleteById(Integer paramInteger);

	public abstract Integer insert(ForbiddenUsersQuery forbiddenUsersQuery);

	public abstract void deleteForbiddenUsersById(Integer forbiddenId);

	/**
	 * 获取评价审核总条数
	 * 
	 * @param commentQuery
	 * @return
	 */
	public int countByConditionComment(CommentQuery commentQuery);

	/**
	 * 获取评价审核列表
	 * 
	 * @param commentQuery
	 * @return
	 */
	public List<Comment> selectByConditionForPageComment(
			CommentQuery commentQuery);

	/**
	 * 获取禁言名单总条数
	 * 
	 * @param commentQuery
	 * @return
	 */
	public int countByConditionForbiddenUsers(
			ForbiddenUsersQuery forbiddenUsersQuery);

	/**
	 * 获取禁言名单列表
	 * 
	 * @param commentQuery
	 * @return
	 */
	public List<ForbiddenUsers> selectByConditionForPageForbiddenUsers(
			ForbiddenUsersQuery forbiddenUsers);
}
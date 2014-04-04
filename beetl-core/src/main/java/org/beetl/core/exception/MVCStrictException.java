package org.beetl.core.exception;

import org.beetl.core.statement.GrammarToken;

public class MVCStrictException extends BeetlException
{

	public MVCStrictException(GrammarToken token)
	{
		super(BeetlException.STRICK_MVC);
		this.token = token;
		// TODO Auto-generated constructor stub
	}

}
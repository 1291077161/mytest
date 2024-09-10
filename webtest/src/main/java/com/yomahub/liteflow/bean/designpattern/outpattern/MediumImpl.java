package com.yomahub.liteflow.bean.designpattern.outpattern;

import java.util.ArrayList;
import java.util.List;

// 中介者
public class MediumImpl implements IMedium {
	private List<AbstractCustomer> members = new ArrayList<AbstractCustomer>();

	@Override
	public void register(AbstractCustomer member) {
		if (!members.contains(member)) {
			members.add(member);
			member.setMedium(this);
		}
	}

	@Override
	public void relay(String from, String ad) {
		for (AbstractCustomer ob : members) {
			String name = ob.getName();
			if (!name.equals(from)) {
				((AbstractCustomer) ob).receive(from, ad);
			}
		}
	}
}

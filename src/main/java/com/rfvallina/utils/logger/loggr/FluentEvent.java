package com.rfvallina.utils.logger.loggr;

public class FluentEvent extends FluentEventBase<FluentEvent> {

	@Override
	public FluentEvent text(String text) {
		return super.text(text);
	}

	@Override
	public FluentEvent link(String link) {
		return super.link(link);
	}

	@Override
	public FluentEvent source(String source) {
		return super.source(source);
	}

	@Override
	public FluentEvent user(String user) {
		return super.user(user);
	}

	@Override
	public FluentEvent tags(String tags) {
		return super.tags(tags);
	}

	@Override
	public FluentEvent value(double value) {
		return super.value(value);
	}

	@Override
	public FluentEvent data(String data) {
		return super.data(data);
	}

	@Override
	public FluentEvent dataType(com.rfvallina.utils.logger.loggr.DataType dataType) {
		return super.dataType(dataType);
	}

	public Event event() {
		return super._event;
	}

	// inherits for creating a simple API

}

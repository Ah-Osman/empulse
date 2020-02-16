'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services' ]);
demoApp.constant("CONSTANTS", {
	getStockInformationById : "/stock/stockInformation/",
	getProductInformationById : "/stock/productInformation/",
	refillStockById: "/stock/refillStock/",
	buyProductById: "/stock/buyProduct/"
	getAllStocks : "/stock//getAllStocks"
});
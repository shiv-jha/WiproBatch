const assert = require('chai').assert;
var expect = require('chai').expect
const app= require('../app');

describe('App', function() {
	
	
	before(function()
		{
			console.log('before all section');
		});
		
		beforeEach(function()
		{
			console.log('before each section');
		});
		
		after(function()
		{
			console.log('after all section');
		});
		
		afterEach(function()
		{
			console.log('after each section');
		});
	describe('helloTest',function()
	{
		resultHelloTest=app.helloTest();
	  it('app should return hello', function() {
		assert.equal(resultHelloTest, 'hello');
		
	  });
	  
	  it('app should return hello', function() {
		assert.typeOf(resultHelloTest,'string');
		
	  });
	  
	  it('app should return hello', function() {
		assert.equal(resultHelloTest, 'hello123');
		
	  });
	});
	
	describe('addNumbers',function()
	{
		x=5;
		y=6;
//this.retries(4);
		 it('addition of 2 and 3 should be 5', function() {
			 if(x==4)
			 {
				 assert.equal(app.addNumbers(2,3), 5);
			 }
			 else
			 {
				 this.skip();
			 }
		
		});
		it('addition of 5 and 6 should be 11', function() {
			this.retries(4);
			x++;
			y++;
			console.log('retries function');
		assert.equal(app.addNumbers(x,y), x-y);
		});
		it('addition should return number', function() {
		//assert.typeOf(app.addNumbers(5,6),'string'); 
		expect(app.addNumbers(5,6)).to.be.a('string');
		
	  });
	  
	  it('addition should return number', function() {
		assert.isAbove(app.addNumbers(5,6),6); 
		
	  });
 });
});
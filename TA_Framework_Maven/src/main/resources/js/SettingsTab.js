//Going through settings tab and pulling all the tags 
describe('Settings Tab Testing', function() {
  var timeline_trainers = element(by.xpath('//*[@id="input_3"]'));
  var reports_outgoing_grads = element(by.xpath('//*[@id=\"input_4\"]'));
  var reports_candidates_incoming = element(by.xpath('//*[@id=\"input_5\"]'));
  var default_batch_location = element(by.id('select_value_label_1'));
  var default_batch_building = element(by.id('select_value_label_2'));
  var minimum_batch_size = element(by.xpath('//*[@id=\"input_10\"]'));
  var maximum_batch_size = element(by.xpath('//*[@id="input_11"]'));
  var default_batch_length = element(by.xpath('//*[@id="input_12"]'));
  var minimum_day_between = element(by.xpath('//*[@id="input_13"]'));


    it('should have a title', function() {
		  //must use driver because login page is not in angular
		browser.driver.get('https://dev.assignforce.revaturelabs.com');
    browser.manage().timeouts().implicitlyWait(10000);
    browser.ignoreSynchronization = true;
		browser.driver.findElement(by.id('username')).sendKeys('test.vpoftech@revature.com.int1');
		browser.driver.findElement(by.id('password')).sendKeys('yuvi1712');
		browser.driver.findElement(by.id('Login')).click();
		
		console.log(browser.driver.getTitle());
		
		expect(browser.driver.getTitle()).toEqual('AssignForce');
	});

  it('should go to the settings tab', function() { 
       
	   browser.findElement(by.xpath('html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a/span/span')).click();
		let settings = browser.findElement(by.xpath('html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a/span/span')).getText();
		expect(settings).toEqual('SETTINGS');
  });

  it('should have timeline trainers value', function() {
    expect(timeline_trainers.getAttribute('value')).toEqual('10');
  });

  it('reports outgoing grads', function() {
    // Fill this in.
    expect(reports_outgoing_grads.getAttribute('value')).toEqual('12');
  });

  it('should have reports_candidates_incoming', function() {
    expect(reports_candidates_incoming.getAttribute('value')).toEqual('25');
  });

  it('should have Default batch location', function() {
    // Fill this in.
    expect(default_batch_location.getText()).toEqual('Revature HQ');
  });
  it('should have Default batch building', function() {
    expect(default_batch_building.getText()).toEqual('reston 48');
  });

  it('should have Minimum Batch Size', function() {
    // Fill this in.
    expect(minimum_batch_size.getAttribute('value')).toEqual('20');
  });
  it('should have Maximum Batch Size', function() {
    expect(maximum_batch_size.getAttribute('value')).toEqual('30');
  });

  it('should have default batch length', function() {
    // Fill this in.
    expect(default_batch_length.getAttribute('value')).toEqual('10');
  });
  it('should have minimum day between trainers value', function() {
    expect(minimum_day_between.getAttribute('value')).toEqual('14');
  });

  });
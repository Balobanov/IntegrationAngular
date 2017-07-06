import { IntegrationAngularPage } from './app.po';

describe('integration-angular App', () => {
  let page: IntegrationAngularPage;

  beforeEach(() => {
    page = new IntegrationAngularPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});

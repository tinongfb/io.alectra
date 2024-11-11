import { expect, test } from '@playwright/test';

test('has title', async ({ page }) => {
  await page.goto('https://www.saucedemo.com/');

  // Expect a title "to contain" a substring.
  await expect(page).toHaveTitle('Swag Labs');
});

test('Login to saucedemo', async ({ page }) => {
  // Navigate to the login page of Sauce Demo
  await page.goto('https://www.saucedemo.com/');

  // Fill in the username and password
  await page.fill('#user-name', 'standard_user');
  await page.fill('#password', 'secret_sauce');

  // Click the login button
  await page.click('#login-button');

  // Verify that we are on the inventory page after login
  await expect(page).toHaveURL('https://www.saucedemo.com/inventory.html');
  
  // Optionally, verify that an element on the page exists (like the product list)
  const productList = await page.isVisible('.inventory_list');
  expect(productList).toBe(true);
});

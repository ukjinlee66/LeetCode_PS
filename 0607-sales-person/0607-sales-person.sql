/* Write your PL/SQL query statement below */
select name from SalesPerson t1
where sales_id not in (select sales_id from Orders t2 inner join Company t3
on t2.com_id = t3.com_id where t3.name =  'RED')
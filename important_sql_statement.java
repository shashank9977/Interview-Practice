

   sender     | recipient  | date       | amount
  ------------+------------+------------+--------
   Smith      | Williams   | 2000-01-01 | 200
   Smith      | Taylor     | 2002-09-27 | 1024
   Smith      | Johnson    | 2005-06-26 | 512
   Williams   | Johnson    | 2010-12-17 | 100
   Williams   | Johnson    | 2004-03-22 | 10
   Brown      | Johnson    | 2013-03-20 | 500
   Johnson    | Williams   | 2007-06-02 | 400
   Johnson    | Williams   | 2005-06-26 | 400
   Johnson    | Williams   | 2005-06-26 | 200
   
Johnson account is listed because it has received 1112 USD in the following three transfers: 512 USD + 100 USD + 500 USD = 1112 USD. The Taylor account has received 1024 USD in just one transfer. The Williams account received 1200 USD in four transfers, but it is not listed because no three transfers to that account total at least 1024 USD.

The name of the column in the rowset doesn't matter.

Copyright 2009–2017 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.


select x.r from(
select  recipient r , sum(amount) count from(select recipient , amount , Row_Number() over(Partition BY recipient order by amount desc) as Rank
from transfers) rs where Rank<=3 group by recipient) x where count>=1024;
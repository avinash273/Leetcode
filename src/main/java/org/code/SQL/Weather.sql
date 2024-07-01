select a.id as Id
from Weather a,
     Weather b
where datediff(a.recordDate, b.recordDate) = 1
  and a.temperature > b.temperature;
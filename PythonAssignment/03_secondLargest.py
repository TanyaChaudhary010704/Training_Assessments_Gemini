## Function to find the second largest unique number in a list
def second_largest(nums):
    unique_nums = list(set(nums))
    if len(unique_nums) < 2:
        return None
    unique_nums.sort(reverse=True)
    return unique_nums[1]

#Input list of numbers
nums = list(map(int, input("Enter numbers separated by spaces: ").split()))
print(second_largest(nums)) 
